package com.iwi.vampus.world;

public class Senses {
	private boolean smelly = false;
	private boolean breezy = false;
	private boolean glitter = false;
	private boolean bump = false;
	private boolean scream = false;

	private boolean alive = true;
	private boolean hasGold = false;
	private boolean hasArrow = true;
	private int points = 0;
	private int direction = 0;
	private int x;
	private int y;

	public boolean hasGold() {
		return hasGold;
	}

	public void setHasGold(boolean hasGold) {
		this.hasGold = hasGold;
	}

	public boolean hasArrow() {
		return hasArrow;
	}

	public void setHasArrow(boolean hasArrow) {
		this.hasArrow = hasArrow;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public boolean isSmelly() {
		return smelly;
	}

	public void setSmelly(boolean smelly) {
		this.smelly = smelly;
	}

	public boolean isBreezy() {
		return breezy;
	}

	public void setBreezy(boolean breezy) {
		this.breezy = breezy;
	}

	public boolean isGlitter() {
		return glitter;
	}

	public void setGlitter(boolean glitter) {
		this.glitter = glitter;
	}

	public boolean isBump() {
		return bump;
	}

	public void setBump(boolean bump) {
		this.bump = bump;
	}

	public boolean isScream() {
		return scream;
	}

	public void setScream(boolean scream) {
		this.scream = scream;
	}

	@Override
	public String toString() {
		return "Senses [smelly=" + smelly + ", breezy=" + breezy + ", glitter="
				+ glitter + ", bump=" + bump + ", scream=" + scream
				+ ", alive=" + alive + ", hasGold=" + hasGold + ", hasArrow="
				+ hasArrow + ", points=" + points + "]";
	}

}
