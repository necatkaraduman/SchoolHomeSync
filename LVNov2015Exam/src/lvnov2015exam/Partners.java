/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lvnov2015exam;

/**
 *
 * @author moolm
 */
public class Partners {
    private String organisation,category,website,location;

    public Partners(String organisation, String category, String website, String location) {
        this.organisation = organisation;
        this.category = category;
        this.website = website;
        this.location = location;
    }

    public String getOrganisation() {
        return organisation;
    }

    public String getCategory() {
        return category;
    }

    public String getWebsite() {
        return website;
    }

    public String getLocation() {
        return location;
    }
    
    public void correctWebsite(){
        String[] websites = this.website.split("\\.");
        String newString = "http://www";
        websites[websites.length]="org";
        for(int i = 1;i<websites.length;i++){
            newString = "." + websites[i];
        }
        this.website = newString;
    }
}
