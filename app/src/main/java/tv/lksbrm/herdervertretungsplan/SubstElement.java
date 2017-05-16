package tv.lksbrm.herdervertretungsplan;

/**
 * Created by Lukas on 10.04.2017.
 */
public class SubstElement
{
    private String CLASS;
    private String LESSON;
    private String TEACHER;
    private String ROOM;
    private String SUBJECT;
    private String TEXT;
    private String TYPE;

    public SubstElement(String sclass, String lesson, String teacher, String room, String subject, String text, String type)
    {
        CLASS = sclass;
        LESSON = lesson;
        TEACHER = teacher;
        ROOM = room;
        SUBJECT = subject;
        TEXT = text;
        TYPE = type;
    }

    public String getAffectedClass()
    {
        return CLASS;
    }

    public String getLesson()
    {
        return LESSON;
    }

    public String getTeacher()
    {
        return TEACHER;
    }

    public String getRoom()
    {
        return ROOM;
    }

    public String getSubject()
    {
        return SUBJECT;
    }

    public String getText()
    {
        return TEXT;
    }

    public String getType()
    {
        return TYPE;
    }
}