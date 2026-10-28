package filter;

import pt.ptinovacao.alarmmgr.common.server.filter.FilterIf;
import pt.ptinovacao.alarmmgr.common.server.fm.monitor.PTInAlarmValueImpl;
import pt.ptinovacao.alarmmgr.common.server.fm.monitor.PTInAlarmValueTO;
import pt.ptinovacao.alarmmgr.common.server.more.flexible.filter.MoreFlexibleFilter;
import pt.ptinovacao.alarmmgr.common.shared.fm.monitor.types.SeverityState;
import pt.ptinovacao.alarmmgr.padapter.common.filter.RuleFilter;
import pt.ptinovacao.alarmmgr.padapter.common.parser.compile.Enumerations;

import java.util.Collections;
import java.util.Map;


public class Filter_793_399 implements RuleFilter {

    @Override
    public Map <String, Object> getAttributesToInject(PTInAlarmValueTO alarm) {

    FilterIf<PTInAlarmValueTO> filterIf;
        try {
            filterIf = MoreFlexibleFilter.get().decode("{\"operator\":\"AND\",\"name\":\"filter\",\"readOnly\":false,\"conditions\":[{\"attribute\":\"subsystem\",\"operator\":\"in\",\"values\":[\"NOKIA\"]}],\"notCondition\":false}");
            if (filterIf.agreesWith(alarm)) {
                return Collections.emptyMap();
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean usePTInAlarmValueTO() {
        return true;
    }

    @Override
    public Long getBundleID(){
        return 793L;
    }

    @Override
    public Long getRuleID(){
        return 399L;
    }
}