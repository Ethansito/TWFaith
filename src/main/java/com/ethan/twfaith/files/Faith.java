package com.ethan.twfaith.files;

import java.util.List;
import java.util.UUID;

public class Faith {
    private String faith_name;
    private UUID leader;
    private int faith_points;
    private List<UUID> invited_players;
    private List<UUID> followers;


    public Faith(String faith_name, UUID leader, int faith_points, List<UUID> invited_players, List<UUID> followers) {
        this.faith_name = faith_name;
        this.leader = leader;
        this.faith_points = faith_points;
        this.invited_players = invited_players;
        this.followers = followers;
    }

    public String getFaith_name() {
        return faith_name;
    }

    public UUID getLeader() {
        return leader;
    }

    public int getFaith_points() {
        return faith_points;
    }

    public List<UUID> getInvited_players(){
        return invited_players;
    }

    public List<UUID> getFollowers() {
        return followers;
    }

    public void setFaith_name(String faith_name) {
        this.faith_name = faith_name;
    }

    public void setLeader(UUID leader) {
        this.leader = leader;
    }

    public void setFaith_points(int faith_points) {
        this.faith_points = faith_points;
    }

    public void setInvited_players(List<UUID> invited_players){
        this.invited_players = invited_players;
    }

    public void setFollowers(List<UUID> followers) {
        this.followers = followers;
    }
}
