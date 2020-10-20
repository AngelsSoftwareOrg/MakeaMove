package org.angelssoftware.models;

import java.util.ArrayList;
import java.util.List;

import org.angelssoftware.structures.MoveDirection;
import org.angelssoftware.utilities.StringUtils;
import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;
import org.kohsuke.args4j.OptionHandlerFilter;

public class ApplicationArgumentModel extends RobotProperties{

    @Argument
    private List<String> arguments = new ArrayList<String>();

    @Option(name="-mouse-direction",aliases="-m-d",
    		usage="Set the Mouse Direction you want wherein the movement automation will apply. "
    			+ "Possible values are UP, DOWN, LEFT, RIGHT."
    			+ "Default is UP")
    private String mouseDirectionArg;
	
    @Option(name="-execution-period",aliases="-e",
    		usage="Defines the timing of execution in milliseconds. "
    		    + "System will continously trigger the next execution after the defined period (similar to delay execution)."
    		    + "Default is 20,000 (20 seconds)")
    private int executionPeriodArg;

    @Option(name="-mouse-hop-px",aliases="-mpx",
    		usage="Defines the number of pixels the mouse will move to in the automation. "
    		    + "Default is 1 pixel")
    private int mouseHopInPxArg;
    
	public ApplicationArgumentModel(String[] args) {
        CmdLineParser parser = new CmdLineParser(this);
        
        try {
            // parse the arguments.
            parser.parseArgument(args);
            matchSetTheArguments();
        } catch( CmdLineException e ) {
            // if there's a problem in the command line,
            // you'll get this exception. this will report
            // an error message.
            System.err.println(e.getMessage());
            System.err.println("java SampleMain [options...] arguments...");
            // print the list of available options
            parser.printUsage(System.err);
            System.err.println();

            // print option sample. This is useful some time
            System.err.println("  Example: java SampleMain"+parser.printExample(OptionHandlerFilter.ALL, null));

            return;
        }
	}

	private void matchSetTheArguments() {
		matchMouseDirectionArg();
		if(!(executionPeriodArg <=0)) setTimeDelayInMillis(executionPeriodArg);
		if(!(mouseHopInPxArg <=0)) setMouseHopInPx(mouseHopInPxArg);
	}

	private void matchMouseDirectionArg() {
		if(StringUtils.isNullOrWhiteSpace(mouseDirectionArg)) return;
		
		switch(mouseDirectionArg.toUpperCase().trim()){
			case "UP":
				setMoveDirection(MoveDirection.UP);
				break;
			case "DOWN":
				setMoveDirection(MoveDirection.DOWN);
				break;
			case "LEFT":
				setMoveDirection(MoveDirection.LEFT);
				break;
			case "RIGHT":
				setMoveDirection(MoveDirection.RIGHT);
				break;
			default:
				setMoveDirection(MoveDirection.UP);
				break;
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("Args mouseDirectionArg: " + mouseDirectionArg);
		sb.append(System.lineSeparator());
		sb.append("Args executionPeriodArg: " + executionPeriodArg);
		sb.append(System.lineSeparator());
		sb.append("Args mouseHopInPxArg: " + mouseHopInPxArg);
		sb.append(System.lineSeparator());
		sb.append("~~~ Other arguments are:");
		sb.append(System.lineSeparator());
		
        for( String s : arguments ) {
    		sb.append(s);
    		sb.append(System.lineSeparator());
        }
		return sb.toString();
	}
}
