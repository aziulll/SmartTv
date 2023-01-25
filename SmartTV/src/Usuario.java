public class Usuario {
    public static void main(String[] args) {
       SmartTV smartTV =  new SmartTV();

       System.out.println (" Tv Ligada ? " + smartTV.ligada);
       System.out.println (" Canal Atual: " + smartTV.canal);
       System.out.println (" Volume Atual: " + smartTV.volume);

       smartTV.ligar(); 
       System.out.println (" Ligando a TV : " + smartTV.ligada);

       // volume 
       smartTV.aumentarVolume();
       System.out.println(" Aumentando o volume : " + smartTV.volume);

       smartTV.diminuirVolume();
       System.out.println(" Diminuindo o volume : " + smartTV.volume);
       //canal
       smartTV.aumentarCanal();
       System.out.println(" Aumentando o canal : " + smartTV.canal);
       
       smartTV.mudarCanal(13); 
       System.out.println(" Mudando de Canal manualmente: " + smartTV.canal);

       smartTV.diminuirCanal();
       System.out.println(" Diminuindo o canal : " + smartTV.canal);
   
       smartTV.desligar(); 
       System.out.println (" Desligando a TV  " + smartTV.ligada );
    }
   }
