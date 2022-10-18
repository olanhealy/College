import java.util.Arrays;

public class Image  {
    private int [][] pixels;
    private int width;
    private int height; //all from code

    
    
    
    public Image(int[][] pixels) {
        this.pixels = pixels;
        this.height = pixels.length;
        this.width = pixels[0].length; //all from code
    }

    
    public String toString() {
        return Arrays.deepToString(pixels); //This was used in your driver and is a much more efficent way off changing the arrays to strings(SAVIOUR)
    }

    public void flip(boolean horizontal) {
        int i, j; //i for rows j for columns
        int temp; 
          if(horizontal == true){ // boolean check 
            for( i=0; i < height; i++){  //if i < height then goes to next part in nested for loop
                for( j=0; j < width/2; j++){ //if columns < the widht/2 then step 3
                    temp = pixels[i][j]; // temp variable
                    pixels[i][j] = pixels[i][width - 1 - j]; //declaring our pixels for horizontal flip 
                    pixels[i][width -1 - j] = temp;
                }
            }
        } else {
            // because we are swapping rows we dont need a nestled loop,
            // but we do need a different temp value

            for( i=0; i< height/2; i++){
                int [] tempVert = pixels[i];
                pixels[i] = pixels[height - 1 - i];
                pixels[height - 1 - i] = tempVert;
            }
        }
    }

    

    public void rotate (boolean clockwise) {
        int i, j; //declare variables for row and columns
        int[][] pixels_new = new int[width][height]; // our new pixels calculator array for flipping
        if(clockwise == true){  //check if true
            for( i=0; i < height; i++){    //when the row = 0 and is less than the height it will move onto the second for loop as they are nested
                for( j=0; j < width; j++){   // when the column is 0 and is less than the width it will do step 3 and add 1 to coulmn (j++) then 1 to row (i++
                    pixels_new[j][height-1-i] = pixels[i][j]; //our pixels new array will store what j is and what the height is -1 and - whatever i is now hence flipping clockwise
                }
            }
        } else { //otherwise this operation will take place ( flip anti clockwise)
            for( i=0; i < height; i++){
                for(j=0; j < width; j++){
                    pixels_new[width-1-j][i] = pixels[i][j]; //this code is pretty much the same except different step three which will do the opposite of storing array
                }
            }
        }
        this.pixels = pixels_new;   // we are using different variable for the flipping compared to horizontal so needs to be declared
        int heightNew = width;
        int widthNew = height;    // As the width and heights are swapping from the horizontal flip 
        this.height = heightNew;
        this.width = widthNew;   // delcare our new width and height
    }
}

    
