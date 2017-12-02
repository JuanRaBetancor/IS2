package imageviewer.control;

import imageviewer.view.ImageDisplay;

public class PrevImageCommand implements Command{
     private ImageDisplay imageDisplay;

    public PrevImageCommand(ImageDisplay imageDisplay) {
        this.imageDisplay = imageDisplay;
    }

    @Override
    public void execute() {
        imageDisplay.show(imageDisplay.image().prev());
    }
    
}
