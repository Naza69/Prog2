public class Company {
    private Section[] sections;
    public Company(Section[] sections){
        this.sections = sections;
    }
    public Company(){}

    public Section[] getSections() {
        return sections;
    }

    public void setSections(Section[] sections) {
        this.sections = sections;
    }

}

