import java.util.Scanner;

void main() {
    //variables
    int nom1 = 0;
    int nom2 = 0;
    int nom3 = 0;
    int nom4 = 0;
    int nom5 = 0;
    Scanner Lectura = new Scanner(System.in);
    System.out.println("escriu 5 numeros enters");
    nom1 = Lectura.nextInt();
    nom2 = Lectura.nextInt();
    nom3 = Lectura.nextInt();
    nom4 = Lectura.nextInt();
    nom5 = Lectura.nextInt();
    float[] valor = {nom1,nom2,nom3,nom4,nom5};
    System.out.println("0:"+valor[0]+" "+"1:"+valor[1]+" "+"2:"+valor[2]+" "+"3:"+valor[3]+" "+"4:"+valor[4]);
    System.out.println("Longitud:"+valor.length+" "+"Primer valor:"+valor[0]+" "+"Ultim valor:"+valor[4]);

}
