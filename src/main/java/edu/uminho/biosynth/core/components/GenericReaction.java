package edu.uminho.biosynth.core.components;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

@MappedSuperclass
public class GenericReaction extends AbstractGenericEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public static boolean ORIENTATION_NORMAL  = true;
	public static boolean ORIENTATION_REVERSE = false;
	public static boolean ORIENTATION_LEFT_TO_RIGHT  = true;
	public static boolean ORIENTATION_RIGHT_TO_LEFT = false;
	
	public static String LEFT_TO_RIGHT = "LR";
	public static String RIGHT_TO_LEFT = "RL";

	@Column(name="REV") protected int orientation;	
	
	@Transient private Set<String> similarRxn;
	
//	private Map<String, GenericMetabolite>		cpdMap;
//	private Map<String, GenericEnzyme>			ecnMap;
//	private Map<String, GenericReactionPair>	rprMap;
	
	public int getOrientation() {
		return this.orientation;
	}
	public void setOrientation(int orientation) {
		this.orientation = orientation;
	}
	
	public String getFullDetails() {
		StringBuilder ret = new StringBuilder();
		ret.append("Key: ").append( this.id).append('\n');
		ret.append("ID: ").append(this.getEntry()).append('\n');
		ret.append("Name: ").append(this.name).append('\n');
//		ret.append("Equation: ").append(this.equation).append('\n');
//		ret.append("Left: ").append(this.left).append('\n');
//		ret.append("Right: ").append(this.right).append('\n');
//		ret.append("Similar: ").append(this.similarRxn).append('\n');
//		ret.append("Enzyme: ").append(this.ecnMap.keySet()).append('\n');
//		ret.append("RPairs: ").append(this.rprMap.keySet()).append('\n');
		return ret.toString();
	}
	
	
	@Override
	public String toString() {
		final char sep = '\n';
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString()).append(sep);
		sb.append("Orientation:")
			.append('(')
			.append(this.orientation)
			.append(')')
			.append(' ')
			.append(this.orientation == 0 ? "L <-> R" : (this.orientation < 0 ? "L <-- R" : "L --> R" ));
		return sb.toString();
	}
}
