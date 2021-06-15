import java.util.Scanner;

public class Cinema{

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		 String nome;
		 int alfa,aa=23,ba=23,ca=23,da=23,ea=24,fa=24,defa=12;
         int beta,ab=24,bb=24,cb=24,db=24,eb=24,defb=6;
         int escolha,ingreso=0,lugar;
        
         
         
         alfa=aa+ba+ca+da+ea+fa;
         beta=ab+bb+cb+db+eb;
         
         
         System.out.println("Olá qual seu nome:");
         nome=in.nextLine();
         
         System.out.println("nós temos hoje em cartaz: \n1- AS branquela \n2- arrival");
         escolha=in.nextInt();
         
         
         if (escolha <=0 || escolha >=3 ) {
   	 		
   	 		System.out.println("escolha uma opção valida");
         }
   	 		//sala_alfa
         if(escolha==1) {
        	 
        	 
        	   System.out.println("otimo! qual fileira você quer se Sentar escolha entre a fileira A a f para isso  escolha entra 1 a 6 ou 7 para preferencial " );
        	   lugar=in.nextInt();
        	 
        	 System.out.println("agora escolha quantos ingresos você gostaria de comprar");
        	 	ingreso=in.nextInt();
        	   
        	   if(lugar >0 && lugar<5) {
        	 	
        		
        	 
        	 
        	  if(ingreso>0 && ingreso<24) {
        		  
        		  System.out.println(nome + " " +"obrigado pela preferençia !" );
        		  System.out.println("numero de acentos ainda disponivel:" + ((alfa+defa)-ingreso));
        	  }
        	 
        	else if (ingreso>23)	{
        	 
        		System.out.println(" erro! acentos não disponivel ou numero de ingresso maior que a fileira");
        	}
        	 	
        	} 

        	 if(lugar >4 && lugar<7) {
        	 	
        		 System.out.println("agora escolha quantos ingresos você gostaria de comprar");
        	 	ingreso=in.nextInt();
        	 
        	 
        	  if(ingreso>0 && ingreso<25) {
        		  
        		  System.out.println(nome + " " +"obrigado pela preferençia !" );
        		  System.out.println("numero de acentos ainda disponivel:" + ((alfa+defa)-ingreso));
        	  }
        	 
        	else if (ingreso>24)	{
        	 
        		System.out.println(" erro! acentos não disponivel ou numero de ingresso maior que a fileira");
        	}
        	 	
        	} 
        	 
        	 
        	 
        	 
        	 if(lugar==7 && ingreso<=12) {
        	 		
        	 		System.out.println(nome + " " +"obrigado pela preferencia!");
        	 		System.out.println("numero de acentos ainda disponivel:" + ((alfa+defa)-ingreso));
        	 		
        	 	}else if(lugar==7 && ingreso>12) {
        	 		
        	 		System.out.println("acentos não disponivel ou numero de ingresso maior que a fileira");
        	 		System.exit(0);
        	 	
        	 	}
        	 
         }
         
          
         
         
        
      //sala_beta
         
         
         if(escolha==2) {
        	 
        	 
      	   System.out.println("otimo! qual fileira você quer se Sentar escolha entre a fileira A a f para isso  escolha entra 1 a 5 ou 6 para preferencial " );
      	   lugar=in.nextInt();
      	 
      	 System.out.println("agora escolha quantos ingresos você gostaria de comprar");
      	 	ingreso=in.nextInt();
      	   
      	   if(lugar >0 && lugar<6) {
      	 	
      		
      	 
      	 
      	  if(ingreso>0 && ingreso<25) {
      		  
      		  System.out.println(nome + " " +"obrigado pela preferençia !" );
      		  System.out.println("numero de acentos ainda disponivel:" + ((beta+defb)-ingreso));
      	  }
      	 
      	else if (ingreso>24)	{
      	 
      		System.out.println(" erro! acentos não disponivel ou numero de ingresso maior que a fileira");
      	}
      	 	
      	} 

      	 
      	 

      	 
      	 if(lugar==6 && ingreso<=6) {
      	 		
      	 		System.out.println(nome + " " +"obrigado pela preferencia!");
      	 		System.out.println("numero de acentos ainda disponivel:" + ((beta+defb)-ingreso));
      	 		
      	 	}else if(lugar==6 && ingreso>6) {
      	 		
      	 		System.out.println("acentos não disponivel ou numero de ingresso maior que a fileira");
      	 		System.exit(0);
      	 	
      	 	
      	 
    
      	 }	
          
         
         }
         
        
     	
	
	}
}