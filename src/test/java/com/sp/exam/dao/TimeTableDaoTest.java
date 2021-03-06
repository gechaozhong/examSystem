package com.sp.exam.dao;

import com.sp.exam.pojo.TimeTable;
import com.sp.exam.utils.GetSemester;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.zip.CheckedOutputStream;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class TimeTableDaoTest {
    @Autowired
    private TimeTableDao timeTableDao;

    @Test
    public void test1(){
        List<TimeTable> all = timeTableDao.findAll();
        System.out.println(all);
    }

    @Test
    public void test2(){
        List<TimeTable> byTimeDetailLikeAndTimeSemester = timeTableDao.findByTimeDetailLikeAndTimeSemester("%" + "1", GetSemester.get());
        System.out.println(byTimeDetailLikeAndTimeSemester);
    }

}
