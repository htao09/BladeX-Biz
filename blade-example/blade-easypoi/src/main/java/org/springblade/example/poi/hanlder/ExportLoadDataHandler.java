package org.springblade.example.poi.hanlder;

import cn.afterturn.easypoi.handler.inter.IExcelExportServer;
import org.springblade.example.poi.test.entity.MsgClient;
import org.springblade.example.poi.test.entity.MsgClientGroup;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class ExportLoadDataHandler implements IExcelExportServer {

	@Override
	public List<Object> selectListForExcelExport(Object obj, int page) {
		List<Object> list = new ArrayList<Object>();
		for (int i = 0; i < 100; i++) {
			MsgClient client = new MsgClient();
			client.setBirthday(new Date());
			client.setClientName("小明" + i);
			client.setClientPhone("18797" + i);
			client.setCreateBy("JueYue");
			client.setId("1" + i);
			client.setRemark("测试" + i);
			MsgClientGroup group = new MsgClientGroup();
			group.setGroupName("测试" + i);
			client.setGroup(group);
			list.add(client);
		}
		if (page > 10) {
			return null;
		}
		return list;
	}

}
