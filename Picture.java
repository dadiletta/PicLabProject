import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture. This class inherits from SimplePicture and
 * allows the student to add functionality to the Picture class.
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture {
    ///////////////////// constructors //////////////////////////////////

    /**
     * Constructor that takes no arguments
     */
    public Picture() {
        /*
         * not needed but use it to show students the implicit call to super() child
         * constructors always call a parent constructor
         */
        super();
    }

    /**
     * Constructor that takes a file name and creates the picture
     * 
     * @param fileName the name of the file to create the picture from
     */
    public Picture(String fileName) {
        // let the parent class handle this fileName
        super(fileName);
    }

    /**
     * Constructor that takes the width and height
     * 
     * @param height the height of the desired picture
     * @param width  the width of the desired picture
     */
    public Picture(int height, int width) {
        // let the parent class handle this width and height
        super(width, height);
    }

    /**
     * Constructor that takes a picture and creates a copy of that picture
     * 
     * @param copyPicture the picture to copy
     */
    public Picture(Picture copyPicture) {
        // let the parent class do the copy
        super(copyPicture);
    }

    /**
     * Constructor that takes a buffered image
     * 
     * @param image the buffered image to use
     */
    public Picture(BufferedImage image) {
        super(image);
    }

    ////////////////////// methods ///////////////////////////////////////

    /**
     * Method to return a string with information about this picture.
     * 
     * @return a string with information about the picture such as fileName, height
     *         and width.
     */
    public String toString() {
        String output = "Picture, filename " + getFileName() + " height " + getHeight() + " width " + getWidth();
        return output;

    }

    public void popArt() {
        Pixel[][] pixels = this.getPixels2D();

        // top of the picture

            // left side

            // right side


        // bottom of the picture

            // bottom left side

            // bottom right side


        }
    }

    /** Method to set the blue to 0 */
    public void zeroBlue() {
        Pixel[][] pixels = this.getPixels2D();

    }

    /**
     * Method that keeps only the blue color - sets the red and green to zero
     */
    public void keepOnlyBlue() {
        Pixel[][] pixels = this.getPixels2D();

    }

    /** Method that keeps only the red color */
    public void keepOnlyRed() {
        Pixel[][] pixels = this.getPixels2D();

    }

    /** Method that keeps only the green color */
    public void keepOnlyGreen() {
        Pixel[][] pixels = this.getPixels2D();
        // traverse the rows
        // traverse the columns

    }

    /** Method that negates the colors in the picture */
    public void negate() {
        Pixel[][] pixels = this.getPixels2D();

    }

    /** Method that makes the picture all shades of gray */
    public void grayscale() {
        Pixel[][] pixels = this.getPixels2D();

    }

    /**
     * Method to fix pictures taken underwater
     */
    public void fixUnderwater() {
        Pixel[][] grid = this.getPixels2D();

    }

    /**
     * Method that mirrors the picture around a vertical mirror in the center of the
     * picture from left to right
     */
    public void mirrorVertical() {
        Pixel[][] picture = this.getPixels2D();

    }

    /**
     * Method that mirrors the picture around a vertical mirror in the center of the
     * picture from right to left
     */
    public void mirrorVerticalRightToLeft() {
        Pixel[][] pixels = this.getPixels2D();

    }

    /**
     * Method that mirrors the picture around a horizontal mirror in the center of
     * the picture from top to botttom
     */
    public void mirrorHorizontal() {
        Pixel[][] pixels = this.getPixels2D();

    }

    /**
     * Method that mirrors the picture around a horizontal mirror in the center of
     * the picture from bottom to top
     */
    public void mirrorHorizontalBotToTop() {

    }

    /**
     * Mirror around a mirror positioned on the diagonal line from bottom left to
     * top right
     */
    public void mirrorDiagonal() {
        Pixel[][] pixels = this.getPixels2D();

    }

    /** Mirror just part of a picture of a temple */
    public void mirrorTemple() {
        Pixel[][] pixels = this.getPixels2D();

    }

    /** Mirror just part of a picture of a snowman */
    public void mirrorArms() {

    }

    /** Mirror just the gull */
    public void mirrorGull() {

    }

    /**
     * Method to show large changes in color
     * 
     * @param edgeDist the distance for finding edges
     */
    public void edgeDetection(int edgeDist) {
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        Pixel[][] pixels = this.getPixels2D();
        Picture swan = new Picture("swan.jpg");
        Pixel[][] original = swan.getPixels2D();

    }

    /**
     * Method to show large changes in color
     * 
     * @param edgeDist the distance for finding edges
     */
    public void customEdgeDetection(int edgeDist) {
        Picture copy = new Picture(this);

    }

    /** Method to create a collage of several pictures */
    public void createCollage() {
        Pixel[][] pixels = this.getPixels2D();

        this.popArt();
    }

    /**
     * copy from the passed fromPic to the specified startRow and startCol in the
     * current picture
     * 
     * @param fromPic  the picture to copy from
     * @param startRow the start row to copy to
     * @param startCol the start col to copy to
     */
    public void copy(Picture fromPic, int startRow, int startCol) {
        Pixel fromPixel = null;
        Pixel toPixel = null;
        Pixel[][] toPixels = this.getPixels2D();
        Pixel[][] fromPixels = fromPic.getPixels2D();
        for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length
                && toRow < toPixels.length; fromRow++, toRow++) {
            for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length
                    && toCol < toPixels[0].length; fromCol++, toCol++) {
                fromPixel = fromPixels[fromRow][fromCol];
                toPixel = toPixels[toRow][toCol];
                toPixel.setColor(fromPixel.getColor());
            }
        }
    }

    /**
     * copy from the passed fromPic to the specified startRow and startCol in the
     * current picture
     * 
     * @param fromPic      the picture to copy from
     * @param fromStartRow the row to start coping from in the from picture
     * @param fromStartCol the column to start copying from in the from picture
     * @param fromEndRow   the row to stop before in the from picture
     * @param fromEndCol   the column to stop before in the from picture
     * @param toStartRow   the row to start copying to
     * @param toStartCol   the column to start copying to
     */
    public void copy(Picture fromPic, int fromStartRow, int fromStartCol, int fromEndRow, int fromEndCol,
            int toStartRow, int toStartCol) {
        Pixel fromPixel = null;
        Pixel toPixel = null;
        Pixel[][] toPixels = this.getPixels2D();
        Pixel[][] fromPixels = fromPic.getPixels2D();
        for (int fromRow = fromStartRow, toRow = toStartRow; fromRow <= fromEndRow
                && toRow < toPixels.length; fromRow++, toRow++) {
            for (int fromCol = fromStartCol, toCol = toStartCol; fromCol <= fromEndCol
                    && toCol < toPixels[0].length; fromCol++, toCol++) {
                fromPixel = fromPixels[fromRow][fromCol];
                toPixel = toPixels[toRow][toCol];
                toPixel.setColor(fromPixel.getColor());
            }
        }
    }

    /**
     * Method to replace the blue background with the pixels in the newBack picture
     * 
     * @param newBack the picture to copy from
     */
    public void chromakey(Picture newBack) {
        Pixel fromPixel = null;
        Pixel toPixel = null;
        Pixel[][] toPixels = this.getPixels2D();
        Pixel[][] fromPixels = newBack.getPixels2D();
        for (int row = 0; row < this.getHeight(); row++) {
            for (int col = 0; col < this.getWidth(); col++) {
                toPixel = toPixels[row][col];
                if (toPixel.getBlue() > toPixel.getRed()) {
                    fromPixel = fromPixels[row][col];
                    toPixel.setColor(fromPixel.getColor());
                }
            }
        }
    }

    /**
     * Hide a black and white message in the current picture by changing the red to
     * even and then setting it to odd if the message pixel is black
     * 
     * @param messagePict the picture with a message
     */
    public void encode(Picture messagePict) {

        Pixel[][] messagePixels = messagePict.getPixels2D();
        Pixel[][] currPixels = this.getPixels2D();
        Pixel currPixel = null;
        Pixel messagePixel = null;
        int count = 0;
        for (int row = 0; row < this.getHeight(); row++) {
            for (int col = 0; col < this.getWidth(); col++) {
                // if the current pixel red is odd make it even
                currPixel = currPixels[row][col];
                if (currPixel.getRed() % 2 == 1)
                    currPixel.setRed(currPixel.getRed() - 1);
                messagePixel = messagePixels[row][col];
                if (messagePixel.colorDistance(Color.BLACK) < 50) {
                    currPixel.setRed(currPixel.getRed() + 1);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    /**
     * Method to decode a message hidden in the red value of the current picture
     * 
     * @return the picture with the hidden message
     */
    public Picture decode() {
        Pixel[][] pixels = this.getPixels2D();
        int height = this.getHeight();
        int width = this.getWidth();
        Pixel currPixel = null;
        Pixel messagePixel = null;
        Picture messagePicture = new Picture(height, width);
        Pixel[][] messagePixels = messagePicture.getPixels2D();
        int count = 0;
        for (int row = 0; row < this.getHeight(); row++) {
            for (int col = 0; col < this.getWidth(); col++) {
                currPixel = pixels[row][col];
                messagePixel = messagePixels[row][col];
                if (currPixel.getRed() % 2 == 1) {
                    messagePixel.setColor(Color.BLACK);
                    count++;
                }
            }
        }
        System.out.println(count);
        return messagePicture;
    }

    /**
     * Method to return the count of the number of pixels with a red value greater
     * than the passed value
     * 
     * @param value the value to compare to
     * @return the count
     */
    public int getCountRedOverValue(int value) {
        int count = 0;
        Pixel[][] pixels = this.getPixels2D();
        Pixel currPixel = null;
        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < pixels[0].length; col++) {
                currPixel = pixels[row][col];
                if (currPixel.getRed() > value) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * Method to set the red in the top half of the picture to half the original
     * value
     */
    public void setRedToHalfValueInTopHalf() {
        Pixel[][] pixels = this.getPixels2D();
        Pixel currPixel = null;
        for (int row = 0; row < pixels.length / 2; row++) {
            for (int col = 0; col < pixels[0].length; col++) {
                currPixel = pixels[row][col];
                currPixel.setRed(currPixel.getRed() / 2);
            }
        }
    }

    /**
     * Method to clear the blue (set to 0) if it is over the passed value
     * 
     * @param value the value to compare to
     */
    public void clearBlueOverValue(int value) {
        Pixel[][] pixels = this.getPixels2D();
        Pixel currPixel = null;
        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < pixels[0].length; col++) {
                currPixel = pixels[row][col];
                if (currPixel.getBlue() > value) {
                    currPixel.setBlue(0);
                }
            }
        }
    }

    /**
     * Method to return the average value for the specified column
     * 
     * @param col the column index to get the average from
     * @return the average of the values in that column
     */
    public int[] getAverageForColumn(int col) {
        Pixel[][] pixels = this.getPixels2D();
        Pixel currPixel = null;
        int[] averageArray = new int[pixels[col].length];
        int total = 0;

        for (int row = 0; row < pixels.length; row++) {
            currPixel = pixels[row][col];
            total = currPixel.getRed() + currPixel.getGreen() + currPixel.getBlue();
            averageArray[row] = total / 3;
        }
        return averageArray;
    }

    /**
     * A very advanced method that uses lamda functions. Can you figure this out?
     */
    public void applyToEachPixel(Consumer<Pixel> operation) {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] row : pixels)
            for (Pixel p : row)
                operation.accept(p);
    }

    /*
     * Main method for testing - each class in Java can have a main method
     */
    public static void main(String[] args) {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }

} // this } is the end of class Picture, put all new methods before this
