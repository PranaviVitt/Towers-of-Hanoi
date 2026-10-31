public class TowersofHanoiVisual {
    private static final int NUM_DISKS =3;

    private static String [] [] towers;

    public static void main (String[] args){
        towers = new String[NUM_DISKS][3];
        intiTowers();
        printTowers();
            moveDisks(NUM_DISKS,0,1,2);
    }

    private static void intiTowers(){
        for (int i=0; i<NUM_DISKS;i++){
            for(int j=0;j<3;j++){
                towers [i][i] = "|";

            }

            int disk=NUM_DISKS - i;
            towers [i][0] = String.format("%d%d%d",disk, disk, disk);
        }
    }

     private static void intiTowers(){

        for(int i=NUM_DISKS-1; i>=0; i--){
            for (int j=0; j<3; j++){
                System.out.println(towers[i][j]);
            }

            System.out.println();
                
            }
            System.out.println("______________________________");
        }


     private static void moveDisks(int n,int fromRod, int toRod, int auxRod){
        if(n== 1){

            System.out.println("Move disk" + fromRod +1) + "to rod" + (toRod+1);
            moveDiskVisual(fromRod, toRod);
            printTowers();
            return;
        }
        moveDisks(n-1, fromRod, auxRod, toRod);
         System.out.println("Move disk" + fromRod +1) + "to rod" + (toRod+1);
         moveDiskVisual(fromRod, toRod);
         printTowers();
         moveDisks(n-1, fromRod, auxRod, toRod);
     }

      private static void moveDisksVisual(int n,int fromRod, int toRod,){
         
         int diskToMove = -1;
         for(int i = NUM_DISKS -1; i>=0, i--){
            if(!towers[i]fromRod].equal: "|"){
                diskToMove = i;
                break;
            }
         }

         if(diskToMove != -1){
            for(int i=0; i<NUM_DISKS; i++)
            if(towers[i][toRod].equals("|")){
                towers[i][toRod] = towers[diskToMove][fromRod];
                towers[diskToMove][fromRod] = "|";
                break;
            }
         }
      }

     }

