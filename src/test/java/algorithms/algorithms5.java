package algorithms;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class algorithms5 {
	
	    //�Ӽ����������
	    private static String s = "";

	    public static void Input() {//�Ӽ�������һ���ַ�������s��
	        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	        try {
	            s = bf.readLine();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public static int getInt() {//���ַ�������ת��Ϊ����
	        Input();
	        return Integer.parseInt(s);
	    }

	    static class Result {
	        public void print(int d) {
	            if (((d - 1) & (d)) == 0 && (d != 0)) {
	                System.out.println(d + "��2�Ľ׼��η���");
	            }else {
	                System.out.println(d+ "����2�Ľ״η���");
	        }
	    }
	}

	    public static void main(String[] args) {
	        Result result=new Result();
	        System.out.println("������һ������: ");
	        int a=algorithms5.getInt();
	        result.print(a);
	    }
	


}
