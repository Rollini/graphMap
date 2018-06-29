package com.rkhd.servicegraph;

import java.io.File;

/**
 * Created by zhangchun on 2018/6/29.
 */
public class DemoTest {

    public static void createDotGraph(String dotFormat,String fileName)
    {
        GraphViz gv=new GraphViz();
        gv.addln(gv.start_graph());
      //  gv.addln("ratio = fill;");
        gv.addln("node [style=filled,color=\"0.641 0.212 1.000\"];");//node样式
        gv.addln("edge [color=\"0.650 0.700 0.700\", decorate = false];");//线条
        gv.add(dotFormat);
        gv.addln(gv.end_graph());
        // String type = "pdf";
        String type = "pdf";
        // gv.increaseDpi();
        gv.decreaseDpi();
        gv.decreaseDpi();
        File out = new File(fileName+"."+ type);
        gv.writeGraphToFile( gv.getGraph( gv.getDotSource(), type ), out );
    }

    public static void main(String[] args) throws Exception {
     //   String dotFormat="1->2->3;1->3;1->4;4->5;4->6;6->7;5->7;3->8;3->6;8->7;2->8;2->5;";
        String dotFormat="apps_manager_service->base_nsearch_service;apps_manager_service->base_passport_service;apps_manager_service->paas_multichannel_service;apps_manager_service->base_comment_service;apps_manager_service->apps_behavior_service;apps_manager_service->base_global_service;apps_manager_service->paas_log_service;apps_manager_service->base_group_service;apps_manager_service->apps_workflow_service;apps_manager_service->apps_twitter_service;apps_manager_service->base_relation_service;apps_manager_service->base_email_service;apps_manager_service->paas_bot_service;apps_manager_service->base_oauth_service;apps_manager_service->paas_graphresys_service;apps_manager_service->base_setting_service;apps_manager_service->paas_metadata_service;apps_manager_service->paas_auth_service;apps_manager_service->paas_developer_service;apps_manager_service->base_send_service;apps_manager_service->paas_scriptrt_service;apps_manager_service->apps_schedule_service;apps_manager_service->paas_i18n_service;apps_manager_service->paas_bi_service;apps_manager_service->base_comet_service;apps_manager_service->paas_scriptc_service;apps_manager_service->paas_fieldactivity_service;apps_manager_service->base_user_service;apps_manager_service->paas_filemanager_service;apps_manager_service->base_smartsearch_service;apps_manager_service->base_license_service;apps_manager_service->base_COMET_service;apps_manager_service->apps_approval_service;apps_manager_service->base_feed_service;apps_manager_service->paas_compute_service;apps_manager_service->paas_customize_service;apps_manager_service->apps_impandexp_service;apps_manager_service->paas_workflow_service;apps_manager_service->apps_manager_service;apps_manager_service->paas_im_service;paas_customize_service->base_nsearch_service;paas_customize_service->base_passport_service;paas_customize_service->base_mqproduce_service;paas_customize_service->apps_behavior_service;paas_customize_service->base_global_service;paas_customize_service->paas_log_service;paas_customize_service->base_group_service;paas_customize_service->apps_workflow_service;paas_customize_service->apps_twitter_service;paas_customize_service->base_relation_service;paas_customize_service->base_email_service;paas_customize_service->base_setting_service;paas_customize_service->paas_metadata_service;paas_customize_service->paas_auth_service;paas_customize_service->base_send_service;paas_customize_service->apps_schedule_service;paas_customize_service->paas_i18n_service;paas_customize_service->paas_bi_service;paas_customize_service->base_user_service;paas_customize_service->paas_filemanager_service;paas_customize_service->base_smartsearch_service;paas_customize_service->base_license_service;paas_customize_service->apps_approval_service;paas_customize_service->paas_compute_service;paas_customize_service->base_feed_service;paas_customize_service->apps_manager_service;paas_compute_service->base_nsearch_service;paas_compute_service->base_user_service;paas_compute_service->paas_i18n_service;paas_compute_service->base_mq_service;paas_compute_service->paas_customize_service;paas_compute_service->apps_workflow_service;paas_compute_service->paas_metadata_service;";
       // String  dotFormat = "apps-manager-service->base-nsearch-service;";
        createDotGraph(dotFormat, "ServiceMap");
    }
}
