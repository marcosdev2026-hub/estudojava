import java.io.*;
class JUtil{
	public static String readString() throws Exception{
		DataInputStream A = new DataInputStream(System.in);
		return(A.readLine());
	}
	public static short readShort() throws Exception{
		return(Short.valueOf(readString()).shortValue());
	}
	public static int readInt() throws Exception{
		return(Integer.valueOf(readString()).intValue());
	}
	public static float readFloat() throws Exception{
		return(Float.valueOf(readString()).floatValue());
	}
	public static double readDouble() throws Exception{
		return(Double.valueOf(readString()).doubleValue());
	}
	public static void pause() throws Exception{
		String a = readString();
	}
		
}

class Receita
{
	public static void main(String[] args) throws Exception
	{
		double receita, despesa, lucro;
		System.out.println("================================");
		System.out.println("Calculo de Lucro");
		System.out.print("Informe a receita: ");
		receita = JUtil.readDouble();
		System.out.print("Informe a despesa: ");
		despesa = JUtil.readDouble();
		lucro = receita - despesa;
		System.out.println("Receita: "+receita);
		System.out.println("Despesa: "+despesa);
		System.out.println("Lucro: "+lucro);
	}
}
