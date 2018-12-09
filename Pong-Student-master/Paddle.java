import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Paddle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paddle extends Actor
{
    //TODO (108): Declare an integer instance constant called WIDTH that is initialized to 10
    private final int WIDTH = 10; 

    //TODO (109): Declare an integer instance constant called HEIGHT that is initialize to 60
    private final int HEIGHT = 60;

    //TODO (110): Declare a String instance variable called upKey
    private String upKey;

    //TODO (111): Declare a String instance variable called downKey
    private String downKey;

    /**
     * TODO (112): Declare a constructor for the Paddle class with
     *             a boolean parameter called isLeft
     *          
     * TODO (113): Inside the constructor, declare a local GreenfootImage variable called paddleImage
     *             that is initialized to a new GreenfootImage object with a width of WIDTH and a height of HEIGHT
     *          
     * TODO (114): If the Paddle is on the left...
     * 
     *      TODO (115): Set the upKey equal to "w"
     *      
     *      TODO (116): Set the downKey equal to "s"
     *      
     *      TODO (117): Set the color of the paddle image to be player one's color
     *               
     * TODO (118): Otherwise...
     * 
     *      TODO (119): Set the upKey equal to "up"
     *      
     *      TODO (120): Set the downKey equal to "down"
     *      
     *      TODO (121): Set the color of the paddle image to be player two's color
     *               
     * TODO (122): Fill a rectangle on the paddleImage that starts at (0,0) and has a width of WIDTH and a height of HEIGHT
     * 
     * TODO (123): Set the image of the Paddle class to paddleImage
     */
    /**
     * Paddle is the constructor for paddle type objects which sets the image 
     * to a rect with diffrent colors depending on the isLeft parameter
     * 
     * @param isLeft is a boolean (thats referenced) what side the ball is and to what color the ball should be 
     * @return nothing is returned
     */
    public Paddle(boolean isLeft){
        GreenfootImage paddleImage = new GreenfootImage(WIDTH,HEIGHT);
        if (isLeft == true){
            upKey = "w";
            downKey = "s";
            paddleImage.setColor(Color.RED);

        }
        else{
            upKey = "up";
            downKey = "down";
            paddleImage.setColor(Color.BLUE);
        }
        paddleImage.fillRect(0, 0, WIDTH, HEIGHT);
        setImage(paddleImage);
    }

    /**
     * act is the method that is run during every act cycle
     * of the scenario
     *
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act() 
    {
        // Add your action code here.
        //TODO (131): Use a method to check if the player has pressed keyboard keys
        checkKeyPress();
    }    

    /**
     * TODO (126): Declare a method called checkKeyPress that does not
     *             return anything and has no parameters
     *          
     * TODO (127): Inside the method, if the user has pressed down the upKey...
     *      
     *      TODO (128): Set the location to be the current X location and 4 pixels less than the current Y location
     *      
     * TODO (129): If the user has pressed down the downKey...
     * 
     *      TODO (130): Set the location to be the current X location and 4 pixels more than the current Y location
     */
    /**
     * checkKeyPress checks if the up key is pressed or the downKey
     * if the upKey is pressed thus will move the paddle up by subtracting  4
     * if the downKey is pressed thus will move the paddle down by adding  4
     * 
     * @param none There are no parameters
     * @return nonthing is returned
     */
    private void checkKeyPress(){
        if( Greenfoot.isKeyDown(upKey) == true){
            setLocation(getX(),getY() - 4);
        }
        if( Greenfoot.isKeyDown(downKey) == true){
            setLocation(getX(),getY() + 4);
        }
    }
}
