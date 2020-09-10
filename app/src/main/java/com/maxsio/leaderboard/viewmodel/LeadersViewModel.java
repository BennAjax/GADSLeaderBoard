package com.maxsio.leaderboard.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.maxsio.leaderboard.models.LearnerHours;
import com.maxsio.leaderboard.models.SkillIQ;
import com.maxsio.leaderboard.repository.LeadersRepository;

import java.util.List;

public class LeadersViewModel extends AndroidViewModel {
    private LeadersRepository mLeadersRepository;
    private LiveData<List<LearnerHours>> learnerHours;
    private LiveData<List<SkillIQ>> skillIq;

    public LeadersViewModel(@NonNull Application application) {
        super(application);
        mLeadersRepository = new LeadersRepository();
    }

    public LiveData<List<LearnerHours>> getLearningLeaders() {
        learnerHours = mLeadersRepository.getLearnerLeaders();
        return learnerHours;
    }

    public LiveData<List<SkillIQ>> getSkillLeaders() {
        skillIq = mLeadersRepository.getSkillLeaders();
        return skillIq;
    }

}
