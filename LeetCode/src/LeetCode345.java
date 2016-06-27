
public class LeetCode345 {
	/*
	 * Time limit exceed
	 */
	public String reverseVowels(String s) {

		char[] sArray = s.toCharArray();
		for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
			if (!ifVowels(sArray[i])) {
				j++;
				continue;
			}
			if (!ifVowels(sArray[j])) {
				i--;
				continue;
			}

			else if (ifVowels(sArray[i]) && ifVowels(sArray[j])) {
				char temp = sArray[i];
				sArray[i] = sArray[j];
				sArray[j] = temp;
			}

		}
		return String.valueOf(sArray);
	}

	public boolean ifVowels(char s) {
		if (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u' || s == 'A' || s == 'E' || s == 'I' || s == 'O'
				|| s == 'U')
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

	}

}
