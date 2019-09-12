package com.beanbean.expandrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.beanbean.expandrecyclerview.bean.ChildData;
import com.beanbean.expandrecyclerview.bean.Data;
import com.beanbean.expandrecyclerview.bean.GroupData;
import com.beanbean.expandrecyclerview.bean.HeaderData;
import com.beanbean.expandrecyclerview.bean.ItemData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        recyclerView = findViewById(R.id.recyclerView);
    }

    private void makeData(){
        List<Data> list=new ArrayList<>();
        Data data1=new Data();
        data1.setHeaderTitle("啛啛喳喳");
        data1.setGroupTitle("是吃吧吃吧不吃吧");
        List<ChildData> childDataList = new ArrayList<>();
        ChildData childData = new ChildData();
        childData.setDesc("培训课程培训课程培训课程培训课程培训课程培训课程培训课程培训课程,,培训课程培训课程培训课程");
        ChildData childData1 = new ChildData();
        childData1.setDesc("爱国法发顺丰发顺丰啊，打法法法发算法发生法发顺丰违法人防该如何你发个是否,,培训课程培训课程培训课程");
        childDataList.add(childData);
        childDataList.add(childData1);
        data1.setChildDataList(childDataList);
        list.add(data1);

        List<Data> list11=new ArrayList<>();
        Data data11=new Data();
        data11.setHeaderTitle("大点是多");
        data11.setGroupTitle("开展认真磋商");
        List<ChildData> childDataList11 = new ArrayList<>();
        ChildData childData11 = new ChildData();
        childData11.setDesc("据央视新闻客户端9月12日消息，商务部新闻发言人高峰在回答中美经贸磋商相关问题时介绍，目前双方经贸团队一直保持着有效的沟通，按照双方牵头人上周通话商定的情况，双方工作层将于近期见面，开展认真磋商，为下一步高级别经贸磋商做好充分地准备。");
        ChildData childData12 = new ChildData();
        childData12.setDesc("据台湾ETtoday新闻云9月12日消息，日本11日进行内阁改组，新任环境大臣小泉进次郎（Shinjiro Koizumi）当晚表明反核立场，希望全面关闭日本境内的核电厂，将朝着“废核”的方向努力，避免2011年福岛核灾的悲剧重演");
        childDataList11.add(childData11);
        childDataList11.add(childData12);
        data11.setChildDataList(childDataList11);
        list11.add(data11);
    }

    public List<ItemData> getItemDatas(List<Data> datas){
        List<ItemData>itemDatas=new ArrayList<>();
        if(datas!=null&&!datas.isEmpty()){
            int size=datas.size();
            for(int i=0;i<size;i++){
                Data data=datas.get(i);
                //头部
                HeaderData headerData=getHeaderData(data,i);
                itemDatas.add(headerData);
                //中部
                GroupData productGroup = getGroupData(data, i);
                if (productGroup != null) {
                    itemDatas.add(productGroup);
                }
                //底部
                ChildData footerData=getChildData(data,i);
                itemDatas.add(footerData);
            }
        }
        return itemDatas;
    }

    private ChildData getChildData(Data data, int i) {
        return null;
    }

    private GroupData getGroupData(Data data, int i) {
        return null;
    }

    private HeaderData getHeaderData(Data data, int i) {

        return null;
    }

    /*
    * 然后具体的大家要对HeaderData，ProductGroupData和FooterData进行处理，其中ProductGroupData里面包含ProductData的列表数据，这些数据有一个共同点，就是需要设置itemType和itemId，itemType用于设置数据类型，itemId用来存放数据下标(即position)，当然大家更需要处理好 ProductGroupData与ProductData中的数据关联。

ok，数据整合完毕后，就是adapter的处理了，所有数据放到RecyclerView.Adapter中展示，因为所有数据（包括HeaderData，ProductGroupData，FooterData以及ProductData的list）均会平铺展示在RecycleView中，
    *
    * */
}
