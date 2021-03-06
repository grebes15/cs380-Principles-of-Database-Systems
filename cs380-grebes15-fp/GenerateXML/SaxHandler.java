import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.*;

public class SaxHandler extends DefaultHandler {



    public void startDocument() throws SAXException {
        System.out.println("start document   : ");
    }

    public void endDocument() throws SAXException {
        System.out.println("end document     : ");
    }

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        System.out.println("start element    : " + qName);
    }

    public void endElement(String uri, String localName, String qName)
    throws SAXException {
        System.out.println("end element      : " + qName);
    }

    public void characters(char ch[], int start, int length) throws SAXException {
        System.out.println("start characters : " + new String(ch, start, length));
    }

    public void ignorableWhitespace(char ch[], int start, int length) throws SAXException {
    }
} 