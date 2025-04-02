//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;
import java.util.Random;

// Classe principale, con metodo main
class Esercizio {
    
    private static Scanner in = new Scanner(System.in);

    public static void main(String args[]){
    

        int N, contConf;
        
        System.out.print("Inserire la grandezza del vettore: ");
        N = in.nextInt();

        int[] R = new int[N];

        RiempiVettore(R,N);
        contConf = BubbleSort0(R,N);
        System.out.println("Vettore Ordinato: ");
        VisualizzaVettore(R,N);
        System.out.println("Numero di confronti: " + contConf);

        RiempiVettore(R,N);
        contConf = BubbleSort1(R,N);
        System.out.println("Vettore Ordinato: ");
        VisualizzaVettore(R,N);
        System.out.println("Numero di confronti: " + contConf);

        RiempiVettore(R,N);
        contConf = BubbleSort2(R,N);
        System.out.println("Vettore Ordinato: ");
        VisualizzaVettore(R,N);
        System.out.println("Numero di confronti: " + contConf);
    }

    public static void RiempiVettore(int[] V, int N){
        for(int i = 0; i < N; ++i){
            V[i] = (int) (Math.random() * (N * 10));
        }
    }

    public static void VisualizzaVettore(int[] V, int N){
        for(int i = 0; i < N; ++i){
            System.out.println(i + "Â° numero: " + V[i]);
        }
    }

    public static int BubbleSort0(int[] V, int N){
        int conf;
        int i, j, t;

        conf = 0;
        i = 0;

        while(i < N){
            j = 0;
            
            while(j < N - 1){
                conf++;
                if(V[j] > V[j + 1]){
                    t = V[j];
                    V[j] = V[j+i];
                    V[j+1] = t;
                }
                j++;
            }
            i++;
        }

        return conf;
    }
    
    public static int BubbleSort1(int[] V, int N){
        int conf;
        int i, j, t;

        conf = 0;
        i = 0;

        while(i < N){
            j = 0;
            
            while(j < (N - 1)){
                conf++;
                if(V[j] > V[j + 1]){
                    t = V[j];
                    V[j] = V[j+i];
                    V[j+1] = t;
                }
                j++;
            }
            i++;
        }
        
        return conf;
    }

    public static int BubbleSort2(int[] V, int N){
        int conf;
        int i, j, t;
        boolean confronto = true;

        conf = 0;
        i = 0;

        while(i < N && confronto){

            confronto = false;
            j = 0;
            
            while(j < (N - 1) - i){
                conf++;
                if(V[j] > V[j + 1]){
                    t = V[j];
                    V[j] = V[j+i];
                    V[j+1] = t;
                    confronto = true;
                }
                j++;
            }
            i++;
        }
        
        return conf;
    }
}
