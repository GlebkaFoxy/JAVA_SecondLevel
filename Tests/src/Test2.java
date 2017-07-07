import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.FileReader;

/**
 * Created by Глеб on 10.06.2017.
 */
public class Test2 extends DefaultHandler {

    public Test2(){
        super();
    }
    public void showEvent(String name){
        System.out.println("Hello "+ name);
    }

    public static void main(String[] args) throws Exception {
        XMLReader xr = XMLReaderFactory.createXMLReader();
        Test2 handler = new Test2();
        xr.setContentHandler(handler);
        xr.setErrorHandler(handler);

        for (int i=0;i<args.length;i++){
            FileReader r = new FileReader(args[i]);
            xr.parse(new InputSource(r));
        }
   }
    public void startDocument ()
    {
        System.out.println("Start document");
    }

    public void endDocument ()
    {
        System.out.println("End document");
    }

    public void startElement (String uri, String name, String qName, Attributes atts)
    {
    if ("".equals (uri))
        System.out.println("Start element: " + qName);
    else
        System.out.println("Start element: {" + uri + "}" + name);
    }

        public void endElement (String uri, String name, String qName)
        {
    if ("".equals (uri))
        System.out.println("End element: " + qName);
    else
        System.out.println("End element:   {" + uri + "}" + name);
        }


    public void characters (char ch[], int start, int length)
    {
    System.out.print("Characters:    \"");
    for (int i = start; i < start + length; i++) {
        switch (ch[i]) {
        case '\\':
        System.out.print("\\\\");
        break;
        case '"':
        System.out.print("\\\"");
        break;
        case '\n':
        System.out.print("\\n");
        break;
        case '\r':
        System.out.print("\\r");
        break;
        case '\t':
        System.out.print("\\t");
        break;
        default:
        System.out.print(ch[i]);
        break;
        }
    }
    System.out.print("\"\n");
    }

}


class Test2Drive{

}