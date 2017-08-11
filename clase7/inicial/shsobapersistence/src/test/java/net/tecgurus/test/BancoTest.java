package net.tecgurus.test;

import net.tecgurus.exception.TGPersistenceException;
import net.tecgurus.persistence.dao.BancoDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Amaro on 10/08/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:data-applicationContext.xml" })
public class BancoTest {

    @Autowired
    private BancoDAO daoBanco;
    private static final Logger log = LoggerFactory.getLogger(BancoTest.class);

    @Test
    @Transactional
    public void test() {
        log.info("Finding all bancos");
        try {
            log.info("Size of banco's list: {}", daoBanco.getAll() == null ? "0" : daoBanco.getAll().size());
        } catch (TGPersistenceException e) {
            log.error("Error finding banco's information: {}", e.getMessage());
        }
        log.info("Ended");
    }

}
