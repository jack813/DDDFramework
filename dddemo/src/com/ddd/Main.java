package com.ddd;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Job job = new Job();
        System.out.println(job);

        JobManager jobManager = new JobManager();
        Job[] jobs = (Job[]) jobManager.getOpportunityList(new JobProvider());
        System.out.println(jobs[0].toString());

        // sense #1
        // 首页推荐--详情页--投递

        // sense #2
        // 首页推荐--投递

        // sense #3
        // 搜索--详情页--投递

        // sense #4
        // 首页推荐--详情页--相似职位--投递

        // sense #5
        // 首页推荐--详情页--相似职位--返回首页--投递

        // sense #6
        // 首页推荐--详情页--相似位置--返回首页--刷新--详情页--投递

        // sense #7
        // 搜索结果--详情页--相似职位--返回搜索结果--更改搜索条件--详情页--投递

        // sense #8
        // 创建简历推荐职位--详情页--投递

        // sense #9
        // 投递反馈相似职位--详情页--投递

        // sense #10
        // 广告位--详情页--投递

        // sense #11
        // 搜索结果--详情页--公司下职位--详情页--投递

    }
}
