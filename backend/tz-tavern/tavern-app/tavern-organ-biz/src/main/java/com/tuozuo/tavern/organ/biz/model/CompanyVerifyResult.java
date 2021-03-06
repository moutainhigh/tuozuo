package com.tuozuo.tavern.organ.biz.model;

import com.google.common.collect.Lists;

import java.math.BigDecimal;
import java.util.List;

/**
 * Code Monkey: 何彪 <br>
 * Dev Time: 2020/11/23 <br>
 */
public class CompanyVerifyResult {

    private static final BigDecimal DEF_SCORES = new BigDecimal(80);
    private static final BigDecimal PERFECT_SCORES = new BigDecimal(60);

    private BigDecimal totalScores;
    private BigDecimal pinyinDupScores;
    private BigDecimal wordDupScores;
    private BigDecimal pinYinPosScores;
    private BigDecimal wordPosScores;
    private BigDecimal industryScores;
    private List<CompanyNameScore> pinyinDupRecords = Lists.newArrayList();
    private List<CompanyNameScore> wordDupRecords = Lists.newArrayList();
    private List<CompanyNameScore> pinYinPosDupRecords = Lists.newArrayList();
    private List<CompanyNameScore> wordPosRecords = Lists.newArrayList();
    private List<CompanyNameScore> industryDescRecords = Lists.newArrayList();

    private List<RecordResult> maxScoreRecords = Lists.newArrayList();

    public CompanyVerifyResult() {
    }

    public CompanyVerifyResult(BigDecimal totalScores, BigDecimal pinyinDupScores, BigDecimal wordDupScores, BigDecimal pinYinPosScores, BigDecimal wordPosScores, BigDecimal industryScores, List<RecordResult> maxScoreRecords) {
        this.totalScores = totalScores;
        this.pinyinDupScores = pinyinDupScores;
        this.wordDupScores = wordDupScores;
        this.pinYinPosScores = pinYinPosScores;
        this.wordPosScores = wordPosScores;
        this.industryScores = industryScores;
        this.maxScoreRecords = maxScoreRecords;
    }

    public CompanyVerifyResult(BigDecimal totalScores) {
        this.totalScores = totalScores;
    }

    public static CompanyVerifyResult defCompanyNameRecord() {
        return new CompanyVerifyResult(DEF_SCORES);
    }

    public static CompanyVerifyResult perfectCompanyNameRecord(List<RecordResult> perfectRecord) {
        return new CompanyVerifyResult(BigDecimal.ZERO, PERFECT_SCORES, PERFECT_SCORES, PERFECT_SCORES, PERFECT_SCORES, PERFECT_SCORES, perfectRecord);
    }


    public List<RecordResult> getMaxScoreRecords() {
        return maxScoreRecords;
    }

    public void setMaxScoreRecords(List<RecordResult> maxScoreRecords) {
        this.maxScoreRecords = maxScoreRecords;
    }

    public BigDecimal getPinyinDupScores() {
        return pinyinDupScores;
    }

    public void setPinyinDupScores(BigDecimal pinyinDupScores) {
        this.pinyinDupScores = pinyinDupScores;
    }

    public BigDecimal getWordDupScores() {
        return wordDupScores;
    }

    public void setWordDupScores(BigDecimal wordDupScores) {
        this.wordDupScores = wordDupScores;
    }

    public BigDecimal getPinYinPosScores() {
        return pinYinPosScores;
    }

    public void setPinYinPosScores(BigDecimal pinYinPosScores) {
        this.pinYinPosScores = pinYinPosScores;
    }

    public BigDecimal getWordPosScores() {
        return wordPosScores;
    }

    public void setWordPosScores(BigDecimal wordPosScores) {
        this.wordPosScores = wordPosScores;
    }

    public BigDecimal getIndustryScores() {
        return industryScores;
    }

    public void setIndustryScores(BigDecimal industryScores) {
        this.industryScores = industryScores;
    }

    public BigDecimal getTotalScores() {
        return totalScores;
    }

    public void setTotalScores(BigDecimal totalScores) {
        this.totalScores = totalScores;
    }

    public List<CompanyNameScore> getPinyinDupRecords() {
        return pinyinDupRecords;
    }

    public void setPinyinDupRecords(List<CompanyNameScore> pinyinDupRecords) {
        this.pinyinDupRecords = pinyinDupRecords;
    }

    public List<CompanyNameScore> getWordDupRecords() {
        return wordDupRecords;
    }

    public void setWordDupRecords(List<CompanyNameScore> wordDupRecords) {
        this.wordDupRecords = wordDupRecords;
    }

    public List<CompanyNameScore> getPinYinPosDupRecords() {
        return pinYinPosDupRecords;
    }

    public void setPinYinPosDupRecords(List<CompanyNameScore> pinYinPosDupRecords) {
        this.pinYinPosDupRecords = pinYinPosDupRecords;
    }

    public List<CompanyNameScore> getWordPosRecords() {
        return wordPosRecords;
    }

    public void setWordPosRecords(List<CompanyNameScore> wordPosRecords) {
        this.wordPosRecords = wordPosRecords;
    }

    public List<CompanyNameScore> getIndustryDescRecords() {
        return industryDescRecords;
    }

    public void setIndustryDescRecords(List<CompanyNameScore> industryDescRecords) {
        this.industryDescRecords = industryDescRecords;
    }
}
