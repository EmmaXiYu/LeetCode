import java.util.Comparator;

public class FrequenceComparator implements Comparator<Frequency> {

	@Override
	public int compare(Frequency o1, Frequency o2) {
		if(o1.getFrequence()>o2.getFrequence()) return -1;
		else if(o1.getFrequence()<o2.getFrequence()) return 1;
		else return 0;
	}

}
