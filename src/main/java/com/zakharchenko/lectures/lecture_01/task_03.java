package com.zakharchenko.lectures.lecture_01;

public class task_03 {
    public static void main(String[] args) {

        int height = 7;
        int width = 7;
        int figureNumber = 3;
        int space = 4;
        String str="";


            for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= (width*figureNumber + (figureNumber - 1) * space - 2); j++) {
                    if (i == 1 || i == height ) {
                        if(j <= width  ) {
                            System.out.print("1 ");
                        }else if( ( j >= width+space && j < 2*width+space ) ) {
                            System.out.print("2 ");
                        }else if( j >= 2*width+2*space-1  ) {
                            System.out.print("3 ");
                        }else{
                            System.out.print(" ");
                        }
                    }else  {
                        if(j <= width) {
                            if(j==1||j==width){System.out.print("# ");}else{System.out.print("  ");}

                        }else if( ( j >= width+space && j < 2*width+space ) ) {
                            if((j-width-space+1)==i){System.out.print("# ");}else{System.out.print("  ");}
                        }else if( j >= 2*width+2*space-1  ) {
                            if( (2*width+2*space+6)-j==i){System.out.print("# ");}else{System.out.print("  ");}
                        }else{
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
              //  System.out.println(str);
              //  str = "";
            }


/*
        for (int i = 1; i <= 6; i++) {
            for(int j = 1; j <= 6; j++ ){
                if(7-i==j){
                    System.out.print("#");
                }else{
                    System.out.print("_");
                }
            }
            System.out.println();
        }
*/




    }
}
