public class SkillDemo {
    public static boolean sumIsOdd(Integer[] arr) {
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			total = total + arr[i];
		}
		int remainder = total % 2;
		if (remainder == 1){
			return true;
		}
		else {
			return false;
		}
	}
}
