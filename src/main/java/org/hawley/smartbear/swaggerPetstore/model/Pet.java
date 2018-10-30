package org.hawley.smartbear.swaggerPetstore.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Pet")
public class Pet {
  private long id;
  private String name;
  
  public Pet() {
	  
  }
  
  public Pet(long id, String name) {
	  this.id = id;
	  this.name = name;
  }

  @XmlElement(name = "id")
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  @XmlElement(name = "name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

//  @XmlElementWrapper(name = "tags")
//  @XmlElement(name = "tag")
//  public List<Tag> getTags() {
//    return tags;
//  }
//
//  public void setTags(List<Tag> tags) {
//    this.tags = tags;
//  }
}