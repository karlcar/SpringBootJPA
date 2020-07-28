package algorithms;

public class algorithms6 {
	public static int[] descSort(int[] param) {
		int in;
		int out;
		int temp = 0;
		for (out = 0; out < param.length; out++) {
			for (in = param.length - 1; in > out; in--) {
				if (param[in] > param[in - 1]) {
				temp = param[in];
				param[in] = param[in - 1];
				param[in - 1] = temp;
				}
			}
		}
		return param;
	}
	
	
	public static void main(String[] args) {
		int[] param = { 90, 67, 99, 69, 75, 87, 89, 100 };
		param = descSort(param);
		System.out.print("������Ϊ��");
		for (int i = 0; i < param.length; i++) {
		System.out.print(param[i] + ",");
		}
	}
}
