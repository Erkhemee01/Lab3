package lights;

import java.awt.Color;

public class ColoredLight extends Light{
	
	/**
	 * Creates a new colored light.
	 * @param color - color of this light.
	 */
	public ColoredLight(Color color) {
		//Color red
		Color c = new Color(255, 0, 0);
		Light light = new ColoredLight(c);
	}
	
	/**
	 * Returns the color of this light.
	 * @return color of this light.
	 */
	public Color getColor(Color c){
		return c;
	}
	
	/**
	 * Changes the color of this light to be c.
	 */
	public void setColor(Color c) {
		Color o;
		o = c;
	}
	
	/**
	 * Randomly changes this light to be on or off and its color.
	 */
	@Override
	public void randomChange() {
		Light.randomChange()
	}
	
}