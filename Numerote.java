import java.math.BigInteger;

/*public class Numerote {

	private byte [] numerote;
	private boolean signo;

	public Numerote(){

		numerote =new byte[1];
		numerote[0]=0;
		signo = true;  

	}

	public Numerote(String a){

		signo = true;

		if (a.charAt(0) == '+' || a.charAt(0) == '-') {

			if (a.charAt(0) == '+') {

				signo = true;

			} else if (a.charAt(0) == '-') {

				signo = false;

			}

			a = a.substring(1);
		}


		numerote = new byte [a.length()];

		try{

			for(int i = 0;i < a.length(); i++){

				numerote[i]=Byte.parseByte(a.charAt(a.length()-1-i)+"");

			}


		}
		catch(Exception e){

			System.out.println("Errorrr" + e.getMessage());

		}

	}



	public Numerote suma(Numerote a){

		String	b=String.valueOf( Math.abs(a.numerote.length-this.numerote.length-1));
		Numerote resultado=new Numerote(a.toString());
		if(this.numerote.length>a.numerote.length){
			resultado=new Numerote(this.toString());
		}
		int c= a.numerote.length-this.numerote.length;
		byte rtemp=0;
		byte temp=0;
		for(int i=0;i<numerote.length && i< a.numerote.length; i++){
			rtemp=(byte) (this.numerote[i]+a.numerote[i]+temp);
			if(rtemp>9){
				temp=1;
				rtemp-=10;
			}else{
				temp=0;
			}
			resultado.numerote[i]=rtemp;   
		}
		if(c>0){
			for(int i=0;i<c;i++){
				resultado.numerote[this.numerote.length+i]=(byte) (a.numerote[this.numerote.length+i]+temp);
				temp=0;
				System.out.println(i);
			}	
		}else if(c<0){
			for(int i=0;i<Math.abs(c);i++){
				resultado.numerote[i+a.numerote.length]=(byte)(this.numerote[a.numerote.length+i]+temp);
				temp=0;
				System.out.println(i);
			}

		}

		return resultado;


	}


	public Numerote resta(Numerote a){


		Numerote resultado = new Numerote(this.toString());
        byte temp = 0;

		for(int i = 0; i < numerote.length && i < a.numerote.length; i++) {

            if (this.numerote[i] < a.numerote[i] && (numerote.length <= a.numerote.length)) {
                resultado.numerote[i] = (byte)(this.numerote[i] - a.numerote[i]);
            } else if (this.numerote[i] < a.numerote[i]) {
                temp = (byte)(10 + this.numerote[i]);
                resultado.numerote[i] = (byte)(temp - a.numerote[i]);
                temp = (byte)(temp / 10);
                continue;
            } else {
                resultado.numerote[i]  = (byte)(this.numerote[i] - a.numerote[i]);
                temp = (byte)0;
            }
        }
        if ((numerote.length > a.numerote.length) && temp == (byte)1) {
            resultado.numerote[numerote.length-1]  = (byte)(this.numerote[numerote.length-1] - (byte)temp);
        }
        return resultado;

	}

	public Numerote multiplica(Numerote a){

		return new Numerote("00");

	}

	public String toString(){

		StringBuffer palabra= new StringBuffer();

		for(int i = 0; i < this.numerote.length; i++){

			palabra.append(this.numerote[this.numerote.length-1-i]);

		}

		return palabra.toString();

	}

	public static void main(String []args){


		Numerote tnum = new Numerote("17342567897057946835726514356789067958437625143546789065473625");
		Numerote no = new  Numerote("12342567897057946835726514356789067958437625143546789065473625");
		System.out.println("Resta de num1-num2: " + tnum.resta(no));


		System.out.println(" ");

		Numerote num1 = new Numerote("10");
		Numerote num2 = new Numerote("2");
		System.out.println("Resta de num1-num2: " + num1.resta(num2));

		System.out.println(" ");

		num1 = new Numerote("784");
		num2 = new Numerote("143");
		System.out.println("Resta de num1-num2: " + num1.resta(num2));

		System.out.println(" ");

		num1 = new Numerote("100");
		num2 = new Numerote("50");
		System.out.println("Resta de num1-num2: " + num1.resta(num2));

		System.out.println(" ");

		num1 = new Numerote("78431509735821789571623213209");
		num2 = new Numerote("93236412621465972356736921327");
		System.out.println("Resta de num1-num2: " + num1.resta(num2));

		System.out.println(" ");

		num1 = new Numerote("0");
		num2 = new Numerote("2");
		System.out.println("Resta de num1-num2: " + num1.resta(num2));

		System.out.println(" ");

		num1 = new Numerote("1");
		num2 = new Numerote("94");
		System.out.println("Suma de num1+num2: " + num1.suma(num2));

		System.out.println(" ");

		num1 = new Numerote("33956");
		num2 = new Numerote("359");
		System.out.println("Suma de num1+num2: " + num1.suma(num2));

		System.out.println(" ");

		num1 = new Numerote("1");
		num2 = new Numerote("9999");
		System.out.println("Resta de num1-num2: " + num1.resta(num2));
	}

}*/

public class Numerote {

	private byte [] numerote;
	private boolean signo;

	public Numerote(){

		numerote =new byte[1];
		numerote[0]=0;
		signo = true;  

	}

	public Numerote(String a){

		signo = true;

		if (a.charAt(0) == '+' || a.charAt(0) == '-') {

			if (a.charAt(0) == '+') {

				signo = true;

			} else if (a.charAt(0) == '-') {

				signo = false;

			}

			a = a.substring(1);
		}


		numerote = new byte [a.length()];

		try{

			for(int i = 0;i < a.length(); i++){

				numerote[i]=Byte.parseByte(a.charAt(a.length()-1-i)+"");

			}


		}
		catch(Exception e){

			System.out.println("Errorrr" + e.getMessage());

		}

	}

	public Numerote suma(Numerote a){

		String	b=String.valueOf( Math.abs(a.numerote.length-this.numerote.length-1));
		Numerote resultado=new Numerote(a.toString());
		if(this.numerote.length>a.numerote.length){
			resultado=new Numerote(this.toString());
		}
		int c= a.numerote.length-this.numerote.length;
		byte rtemp=0;
		byte temp=0;
		for(int i=0;i<numerote.length && i< a.numerote.length; i++){
			rtemp=(byte) (this.numerote[i]+a.numerote[i]+temp);
			if(rtemp>9){
				temp=1;
				rtemp-=10;
			}else{
				temp=0;
			}
			resultado.numerote[i]=rtemp;   
		}
		if(c>0){
			for(int i=0;i<c;i++){
				resultado.numerote[this.numerote.length+i]=(byte) (a.numerote[this.numerote.length+i]+temp);
				temp=0;
				System.out.println(i);
			}	
		}else if(c<0){
			for(int i=0;i<Math.abs(c);i++){
				resultado.numerote[i+a.numerote.length]=(byte)(this.numerote[a.numerote.length+i]+temp);
				temp=0;
				System.out.println(i);
			}

		}

		return resultado;


	}

	private Numerote resta(Numerote a){

		Numerote resultado = new Numerote(this.toString());
		byte temp = 0;

		if(this.numerote.length > a.numerote.length){ 
			for(int i = 0; i < numerote.length && i < a.numerote.length; i++) {

				if (this.numerote[i] < a.numerote[i] && (numerote.length <= a.numerote.length)) {
					resultado.numerote[i] = (byte)(this.numerote[i] - a.numerote[i]);
				} else if (this.numerote[i] < a.numerote[i]) {
					temp = (byte)(10 + this.numerote[i]);
					resultado.numerote[i] = (byte)(temp - a.numerote[i]);
					temp = (byte)(temp / 10);
					continue;
				} else {
					resultado.numerote[i]  = (byte)(this.numerote[i] - a.numerote[i]);
					temp = (byte)0;
				}
			}
			if ((numerote.length > a.numerote.length) && temp == (byte)1) {
				resultado.numerote[numerote.length-1]  = (byte)(this.numerote[numerote.length-1] - (byte)temp);
			}
			
			return resultado;
		}else if(a.numerote.length > this.numerote.length){
			for(int i = 0; i > numerote.length && i > a.numerote.length; i++) {

				if (this.numerote[i] > a.numerote[i] && (numerote.length >= a.numerote.length)) {
					resultado.numerote[i] = (byte)(this.numerote[i] - a.numerote[i]);
				} else if (this.numerote[i] < a.numerote[i]) {
					temp = (byte)(10 + this.numerote[i]);
					resultado.numerote[i] = (byte)(temp - a.numerote[i]);
					temp = (byte)(temp / 10);
					continue;
				} else {
					resultado.numerote[i]  = (byte)(this.numerote[i] - a.numerote[i]);
					temp = (byte)0;
				}
			}
			if ((numerote.length < a.numerote.length) && temp == (byte)1) {
				resultado.numerote[numerote.length-1]  = (byte)(this.numerote[numerote.length-1] - (byte)temp);
			}
			return resultado;
		}	
		return resultado;
		
	}

	public Numerote multiplica(Numerote x){

		String respuesta = "";
		//Numerote resultado = new Numerote(this.toString());
		int largo,
		sobra,
		mayor,
		multiplicado;
		int numero;
		byte sol = 0;

		if(x.numerote.length <= this.numerote.length){
			largo = x.numerote.length;
			mayor = this.numerote.length;
		}else{
			mayor = x.numerote.length;
			largo = this.numerote.length;
		}

		sobra = 0;
		for(int i=0; i<largo;i++){
			byte n1=0;
			if(this.numerote.length<x.numerote.length){
				if(this.numerote.length>i){
					n1 = this.numerote[i];
				}
			}else{
				if(x.numerote.length>i){
					n1 = x.numerote[i];
				}
			}
			for(int j=0;j<mayor+1; j++){
				byte n2 = 0;
				if(x.numerote.length>this.numerote.length){
					if(x.numerote.length>j){
						n2 = x.numerote[j];
					}
				}else{
					if(this.numerote.length>j){
						n2 = this.numerote[j];
					}
				}
				multiplicado = n1 * n2 + sobra;
				if (sobra!= 0){
					sobra =0;
				}
				sobra=sobra + multiplicado/10;

				multiplicado =multiplicado%10;
				respuesta = multiplicado + respuesta + "";

			}
			numero = Integer.parseInt(respuesta);
			numero = (byte)(numero * (Math.pow(10, i)));
			sol = (byte) (sol + numero);
			numero = 0;
			respuesta = "";
		}

		if((this.signo == true && x.signo == true) || (this.signo == false && x.signo == false)){
			respuesta = sol + "";
		}else{
			sol = (byte) (sol*-1);
			respuesta = sol + "";
		}
		Numerote resultado = new Numerote(respuesta);
		return resultado;


	}

	public String toString(){

		StringBuffer palabra= new StringBuffer();

		for(int i = 0; i < this.numerote.length; i++){

			palabra.append(this.numerote[this.numerote.length-1-i]);

		}

		return palabra.toString();

	}

	public static void main(String []args){


		Numerote tnum = new Numerote("-17342567897057946835726514356789067958437625143546789065473625");
		Numerote no = new  Numerote("12342567897057946835726514356789067958437625143546789065473625");
		System.out.println("Resta de num1-num2: " + tnum.resta(no));


		System.out.println(" ");

		Numerote num1 = new Numerote("10");
		Numerote num2 = new Numerote("2");
		System.out.println("Resta de num1-num2: " + num1.resta(num2));

		System.out.println(" ");

		num1 = new Numerote("784");
		num2 = new Numerote("143");
		System.out.println("Resta de num1-num2: " + num1.resta(num2));

		System.out.println(" ");

		num1 = new Numerote("100");
		num2 = new Numerote("50");
		System.out.println("Resta de num1-num2: " + num1.resta(num2));

		System.out.println(" ");

		num1 = new Numerote("78431509735821789571623213209");
		num2 = new Numerote("93236412621465972356736921327");
		System.out.println("Resta de num1-num2: " + num1.resta(num2));

		System.out.println(" ");

		num1 = new Numerote("0");
		num2 = new Numerote("2");
		System.out.println("Resta de num1-num2: " + num1.resta(num2));

		System.out.println(" ");

		num1 = new Numerote("11243567586754736251456763752645131213224");
		num2 = new Numerote("3214368751493256489237854729318726184");
		System.out.println("Suma de num1+num2: " + num1.suma(num2));

		System.out.println(" ");

		num1 = new Numerote("0");
		num2 = new Numerote("359");
		System.out.println("Suma de num1+num2: " + num1.suma(num2));

		System.out.println(" ");

		num1 = new Numerote("33956123458689073508971235");
		num2 = new Numerote("35905932175239812443897694");
		System.out.println("Multiplicacion de num1-num2: " + num1.multiplica(num2));
	}

}
