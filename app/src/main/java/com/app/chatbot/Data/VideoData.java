package com.app.chatbot.Data;

import com.app.chatbot.Model.Video;
import com.app.chatbot.R;

import java.util.ArrayList;

public class VideoData {
    private static final String [] nameVid = {
            "Kucing Jatuh",
            "Kucing Gelud",
    };
    private static final String [] durasiVid = {
            "2 : 30",
            "3 : 40",
    };
    private static final String [] urlVid = {
            "https://rr5---sn-npoeenee.googlevideo.com/videoplayback?expire=1689429211&ei=e1CyZJOsLILVir4PhKixsAc&ip=191.96.67.180&id=o-AMO17H4ACwGJ1an9nGiKOFhSkijzHnsHGCUDdgXU0Lqr&itag=18&source=youtube&requiressl=yes&spc=Ul2Sqyqgvy7aCz_wzVQC65rhrJ6RTJ518fv6v3g-Sw&vprv=1&svpuc=1&mime=video%2Fmp4&ns=vqp-KIBQbQ6PKNPXIOsgUfwO&cnr=14&ratebypass=yes&dur=253.306&lmt=1671676823553365&fexp=24007246,51000024&c=WEB&txp=6219224&n=fTgKbWDWIE7Y2A&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cspc%2Cvprv%2Csvpuc%2Cmime%2Cns%2Ccnr%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRQIgHh-h-cOfmC0HDGMHwcdodt8DlVTeGHXDTfeLxb0tQQYCIQDITcdi9QeyHaMVMqVUVG9wLC-SqQ1287xb2kHN1L9YQw%3D%3D&redirect_counter=1&cm2rm=sn-q4fe6z7z&req_id=28ec5a9aa00a3ee&cms_redirect=yes&cmsv=e&mh=zU&mip=103.141.255.66&mm=34&mn=sn-npoeenee&ms=ltu&mt=1689407339&mv=m&mvi=5&pl=24&lsparams=mh,mip,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRgIhAJMgCg_3-AIKgKOcqYSLazhg0POBjalNSExzlfwVMlluAiEAsexrDhGS8IRb0AfQ_leGw1-5cLQjIrpV4f4eQ02t7wI%3D",
            "https://youtu.be/Q4IFSABSJeE"
    };
    private static final int [] gambarVid = {
            R.drawable.kucing_1,
            R.drawable.kucing_2,
    };

    public static ArrayList<Video> getListData() {
        ArrayList<Video> list = new ArrayList<>();
        for (int position = 0; position < nameVid.length; position++) {
            Video video = new Video();
            video.setName(nameVid[position]);
            video.setDurasi(durasiVid[position]);
            video.setUrl(urlVid[position]);
            video.setGambar(gambarVid[position]);
            list.add(video);
        }
        return list;
    }
}
