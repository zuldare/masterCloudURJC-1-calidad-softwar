package usantatecla.mastermind.controllers;

public interface VisitorController {

  void visit(StartController startController);
  void visit(ProposalController proposalController);
  void visit(ResumeController resumeController);
}
