public class Numerote {

		private byte [] numerote;
		private boolean signo;

		public Numerote(){

			numerote =new byte [1];
			numerote[0]=0;

		}

		public Numerote(String a){

			numerote= new byte [a.length()];
			try{

				for(int i=0;i<a.length();i++){
					numerote[i]=Byte.parseByte(a.charAt(a.length()-1-i)+"");
					System.out.println(this.numerote[i]);
				}
			}
			catch(Exception e){
				System.out.println("Error" + e.getMessage());
			}

		}

		public Numerote suma(Numerote a){

			return new Numerote("00");

		}

		public Numerote resta(Numerote a){

			return new Numerote("00");

		}

		public Numerote multiplica(Numerote a){

			return new Numerote("00");

		}

		public String toString(){

			StringBuffer palabra= new StringBuffer();
			for(int i=0;i<this.numerote.length;i++){
				palabra.append(this.numerote[this.numerote.length-1-i]);

			}

			return palabra.toString();

		}

		public static void main(String []args){

			Numerote tnum= new Numerote("19990");
			System.out.println(tnum.toString());
			
		}

	}
