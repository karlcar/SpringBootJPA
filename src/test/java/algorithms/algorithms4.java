package algorithms;
import java.util.Arrays;

public class algorithms4 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9}; //ԭ����
		
		int[] b = new int[a.length]; //������
		
		for(int i=0;i<a.length;i++){
			//��������±귶Χ���μ���1������Ϊȡ����Ԫ�ػᱻ�Ӷ�β������ǰ���ã��������ܱ�֤ �����ٲ����Ѿ���������Ԫ�ء�
			int ra = (int) (Math.random()*(a.length-i));
			b[i] = a[ra];
			
			//��ȡ����Ԫ�شӶ�β������ǰ����
			int x = a[a.length-1-i];
			a[a.length-1] = a[ra];
			a[ra] = x;
		}
		//���������ַ�����ʽ���
		System.out.println(Arrays.toString(b));

	}

}
