package com.corndel.cashregister;



public class Sandbox {

        public static void main(String[] args) {
//            drawSemicircle(15);
            Movie movie = new Movie("Iron Giant");
            System.out.println(movie.title);

        }

        public static void drawSemicircle(int radius){
            // works better with a larger radius!

            StringBuilder line = new StringBuilder();
            for (int i = radius; i > 0; i--) {
                // i is the y coord
                // solve the equation x2 + y2 = r2
                int point = (int) Math.sqrt(radius*radius - i*i);
                for(int j = 0; j < radius*2; j++){
                    if(j == (radius - point) || j == (radius + point)){
                        line.append("*");
                    }else{
                        line.append("  ");
                    }

                }

                line.append("\n");
            }
            System.out.println(line);
        }
}


class Movie {
    public String title;

    public Movie(String title) {
        this.title = title;
    }
}