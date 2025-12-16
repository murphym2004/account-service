package atu.ie.accountservice.service;

import atu.ie.accountservice.Account;
import atu.ie.accountservice.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    private final AccountRepository Repo;

    public AccountService(AccountRepository Repo) {
        this.Repo = Repo;
    }
    public Account findById(Long id) {
        return Repo.findById(id).orElse(null);
    }
    public Account create(Account account){
        return Repo.save(account);
    }
    public Account update(Account account){
        return Repo.save(account);
    }
    public void delete(Long id){
        Repo.deleteById(id);
    }
    public List<Account> findAll(){
        return Repo.findAll();
    }

}