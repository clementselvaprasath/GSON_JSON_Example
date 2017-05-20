package com.acanimal.java.json.examples.model;


public class Person {
    private int id;
    private String name;
    private boolean married;
    private String name11;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
        //System.out.println(name.split(" ")[0]);
    }

    public boolean getMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public String getName11() {
		return name11;
	}

	public void setName11(String name11) {
		this.name11 = name11;
	}

	@Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + " married -"+ married +" name11 = "+name11+'}';
    }
    
}
