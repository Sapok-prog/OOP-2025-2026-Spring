package practice_2;

public class StarTriangle {

        private int numOfStars;

        public StarTriangle(int numOfStars){

            this.numOfStars = numOfStars;

        }

        public String toString(){

            StringBuilder triangle = new StringBuilder();

            for(int i = 0;i < numOfStars;i++){
                for(int j = 0;j <= i;j++){

                    triangle.append("[*]");

                }triangle.append("\n");
            }

            return triangle.toString();
        }

    }


