
package org.dcm4che3.tool.unvscp.data;

import java.util.HashMap;

/**
 *
 * @author Pavel Varzinov <varzinov@yandex.ru>
 */
public class DetailedLogMessage extends GenericWebResponse {
    private String uri;
    HashMap<String, Object> params;
    public DetailedLogMessage(String success, String msg, String uri, HashMap<String, Object> params) {
        super(success, msg);
        this.uri = uri;
        this.params = params;
    }
}
