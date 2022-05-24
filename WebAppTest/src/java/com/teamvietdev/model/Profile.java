package com.teamvietdev.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author TVD
 */
@Entity(name = "profile")
public class Profile implements Serializable {

    @Id
    @GeneratedValue
    private long profileId;
    private String profileName;
    private String profileImage;
    private String profileDateofBirth;
    private String profilePosition;
    private String profileCurrentClub;
    private boolean profileStatus;

    // get & set
    public long getProfileId() {
        return profileId;
    }

    public void setProfileId(long profileId) {
        this.profileId = profileId;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getProfileDateofBirth() {
        return profileDateofBirth;
    }

    public void setProfileDateofBirth(String profileDateofBirth) {
        this.profileDateofBirth = profileDateofBirth;
    }

    public String getProfilePosition() {
        return profilePosition;
    }

    public void setProfilePosition(String profilePosition) {
        this.profilePosition = profilePosition;
    }

    public String getProfileCurrentClub() {
        return profileCurrentClub;
    }

    public void setProfileCurrentClub(String profileCurrentClub) {
        this.profileCurrentClub = profileCurrentClub;
    }

    public boolean isProfileStatus() {
        return profileStatus;
    }

    public void setProfileStatus(boolean profileStatus) {
        this.profileStatus = profileStatus;
    }

}
