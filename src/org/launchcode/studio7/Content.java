package org.launchcode.studio7;

public abstract class Content implements ContentInterface{
    private String name;
    private String content;
    private long duration;

    public Content(String aName, String aContent, long aDuration) {
        this.name = aName;
        this.content = aContent;
        this.duration = aDuration;
    }

    public String getName() {
        return name;
    }
    public String getContent() {
        return content;
    }
    public long getDuration() { return duration; }

    @Override
    public String play(){
        return "Now Playing: " + getName() + "\n\t\t\t\t" + getContent();
    }
}
