package com.example.demoWebAppModel;

public class Food {
	private int fid;
	private String fname;
	private double fprice;

	public Food(int fid, String fname, double fprice) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.fprice = fprice;
	}

	public Food() {
		super();
	}

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public double getFprice() {
		return fprice;
	}

	public void setFprice(double fprice) {
		this.fprice = fprice;
	}

	@Override
	public String toString() {
		return "Food [fid=" + fid + ", fname=" + fname + ", fprice=" + fprice + "]";
	}

}
