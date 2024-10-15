package com.dankicode.escape.level.block;

import com.dankicode.escape.Art;
import com.dankicode.escape.entities.Player;
import com.dankicode.escape.gui.Sprite;

public class ApleeBlock extends Block {
	private boolean open = false;
	private Sprite apleeSprite;

	public ApleeBlock() {
		tex = 1;
		blocksMotion = true;

		apleeSprite = new Sprite(0, 0, 0, 8 * 5 + 0, Art.getCol(0xffff00));
		addSprite(apleeSprite);
	}
	
	public void tick() {
		double distance = Math.sqrt((Player.xplayer - x) * (Player.xplayer - x) + (Player.zplayer -y) *(Player.zplayer - y));
		if(distance < 1) {
			System.out.println("perto da maaças");
			this.sprites.remove(apleeSprite);
			blocksMotion = false;
			
		}
	}
}


//import com.dankicode.escape.Art;
//import com.dankicode.escape.gui.Sprite;