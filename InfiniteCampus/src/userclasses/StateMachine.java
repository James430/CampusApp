/**
 * Your application code goes here
 */

package userclasses;

import generated.StateMachineBase;
import com.codename1.ui.*; 
import com.codename1.ui.events.*;
import com.codename1.ui.util.Resources;

/**
 *
 * @author Your name here
 */
public class StateMachine extends StateMachineBase {
    
    public TextArea textbox1 = new TextArea();
    
    public StateMachine(String resFile) {
        super(resFile);
        // do not modify, write code in initVars and initialize class members there,
        // the constructor might be invoked too late due to race conditions that might occur
    }
    
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    protected void initVars(Resources res) {
    }


    protected void onMain_ButtonAction(Component c, ActionEvent event) {
        
        System.out.println("This is a test function");
        
        String testtext;
        testtext = "This is a test function";
        
        textbox1.setText(testtext);
    }

    protected void onCreateMain() {

    }

    protected void onMain_TextAreaAction(Component c, ActionEvent event) {

    
    }

    protected void beforeMain(Form f) {

    }
}
