package com.aries.learn.designpattern.builder.simple;

public class HTMLBuilder implements Builder {
    private String titleCxt = "";
    private String paragraphCxt = "";
    private String itemsCxt = "";

    @Override
    public void makeTitle(String title) {
        this.titleCxt = "\n<title>" + title + "</title>\n";
    }

    @Override
    public void makeParagraph(String paragraph) {
        this.paragraphCxt = "<p>" + paragraph + "</p>\n";
    }

    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            this.itemsCxt += makeItem(items[i]);
        }
        this.itemsCxt = "<ul>\n" + this.itemsCxt + "</ul>\n";
    }

    private String makeItem(String item) {
        return "<li>" + item + "<li>\n";
    }

    private String createHead(String titleCxt) {
        return "<head>" + titleCxt + "</head>\n";
    }

    private String createBody(String paragraphCxt, String itemsCxt) {
        return "<body>\n" + paragraphCxt + itemsCxt + "</body>";
    }

    @Override
    public String use() {
        return "<html>\n" + createHead(titleCxt) + createBody(paragraphCxt, itemsCxt) + "\n</html>";
    }

}
