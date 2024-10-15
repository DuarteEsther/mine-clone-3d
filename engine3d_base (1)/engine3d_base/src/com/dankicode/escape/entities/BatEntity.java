package com.dankicode.escape.entities;

import com.dankicode.escape.*;

public class BatEntity extends EnemyEntity {
	public BatEntity(double x, double z) {
		super(x, z, 4 * 8 + 2 , Art.getCol(0x82666E));    //8 MORCEGO E 8+2 INIMIGO
		this.x = x;
		this.z = z;
		health = 2;
		r = 0.3;

		flying = true;
	}
}
