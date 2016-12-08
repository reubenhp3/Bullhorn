package model;

import java.io.Serializable;
import java.util.Date;

public class BhPost implements Serializable {
	private static final long serialVersionUID = 1L;

	private long postid;
	private Date postdate;
	private String posttext;
	private long bhuserid;

	public long getPostid() {
		return this.postid;
	}

	public void setPostid(long postid) {
		this.postid = postid;
	}

	public Date getPostdate() {
		return this.postdate;
	}

	public void setPostdate(Date postdate) {
		this.postdate = postdate;
	}

	public String getPosttext() {
		return this.posttext;
	}

	public void setPosttext(String posttext) {
		this.posttext = posttext;
	}

	public long getBhuserid() {
		return this.bhuserid;
	}

	public void setBhuserid(long bhuserid) {
		this.bhuserid = bhuserid;
	}

}